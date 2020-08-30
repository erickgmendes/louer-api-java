package com.louer.resources;

import com.louer.application.ClienteService;
import com.louer.domain.Cliente;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Clientes")
@CrossOrigin(origins = "*")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    @ApiOperation(value = "Este método retorna uma lista de Clientes")
    public ResponseEntity<List<Cliente>> listarCliente() {
        List<Cliente> response = clienteService.listarClientes();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/clientes/{id}")
    @ApiOperation(value = "Este método retorna uma Cliente pelo seu identificador")
    public ResponseEntity<Cliente> obterClientePeloId(@PathVariable(value = "id") long id) {
        Cliente response = clienteService.obterClientePeloId(id);

        if (response == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/clientes")
    @ApiOperation(value = "Este método adiciona um Cliente")
    public ResponseEntity<Cliente> incluirCliente(@RequestBody Cliente cliente) {
        Cliente response = clienteService.incluirCliente(cliente);

        if (response == null)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/clientes/{id}")
    @ApiOperation(value = "Este método atualiza uma Cliente")
    public ResponseEntity<Cliente> alterarCliente(@PathVariable(value = "id") long id, @RequestBody Cliente cliente) {
        Cliente response = clienteService.alterarCliente(id, cliente);

        if (response == null)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/clientes/{id}")
    @ApiOperation(value = "Este método exclui uma Cliente")
    public ResponseEntity<Boolean> excluirCliente(@PathVariable(value = "id") long id) {
        if (!clienteService.excluirCliente(id))
            return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(true, HttpStatus.OK);
    }
}