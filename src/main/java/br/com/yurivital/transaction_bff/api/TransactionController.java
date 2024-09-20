package br.com.yurivital.transaction_bff.api;


import br.com.yurivital.transaction_bff.dto.RequestTransactionDto;
import br.com.yurivital.transaction_bff.dto.TransactionDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDto> sendTransacion(@RequestBody final RequestTransactionDto requestTransactionDto) {
        return Mono.empty();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDto> getTransaction(@PathVariable("id") final String uuid) {
        return Mono.empty();
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDto> deleteTransaction(@PathVariable("id") final String uuid) {
        return Mono.empty();
    }

    @PatchMapping(value = "/{id}/confirm", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDto> confirmTransaction(@PathVariable("id") final String uuid) {
        return Mono.empty();
    }

}
