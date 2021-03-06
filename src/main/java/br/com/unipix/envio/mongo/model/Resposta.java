package br.com.unipix.envio.mongo.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Resposta {
	
	private LocalDateTime data;
	private String mensagem;
}
