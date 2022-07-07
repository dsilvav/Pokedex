package com.pokemon;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.pokemon.entity.DetailPoke;
import com.pokemon.usecase.ApiUseCase;

@SpringBootTest
class PokedexApiApplicationTests {

	@Mock
	ApiUseCase auc;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void getInfoPoke() {
		int offset = 20;
		List<DetailPoke> aux = new ArrayList<>();
		when(auc.getPokeInfo(offset)).thenReturn(aux);
		assertThat(aux).isNotNull();
	}
	
	@Test
	void getInfoPokeId() {
		int offset = 20;
		List<Object> aux = new ArrayList<>();
		when(auc.getPokeInfoById(offset)).thenReturn(aux);
		assertThat(aux).isNotNull();
	}
	
	

}
