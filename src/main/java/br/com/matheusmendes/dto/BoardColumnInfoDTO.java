package br.com.matheusmendes.dto;

import br.com.matheusmendes.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}
