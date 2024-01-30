package si.um.feri.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import si.um.feri.vao.Paket;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public record UporabnikDto(Long id, String ime, String priimek) {

}
