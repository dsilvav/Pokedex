/**
 * 
 */
package com.pokemon.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dsilva
 *
 */


@Configuration
@EnableCaching
public class ApiConfig {
	
	@Bean
	public CacheManager cacheManager() {
		return new ConcurrentMapCacheManager("pokemons");
	}

}
