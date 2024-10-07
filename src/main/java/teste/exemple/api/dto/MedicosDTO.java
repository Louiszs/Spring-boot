package teste.exemple.api.dto;

public record MedicosDTO<endereço>(String nome, String email, String crm , Especialidade especialidade, DadosEndereço endereco) {
}
