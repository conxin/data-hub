package com.example.datacollect.jobconfig;

import com.example.datacollect.domain.Category;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author macx
 * @date 2020-02-01
 */
@Configuration
public class CategoryJobConfig {

    private JobBuilderFactory jobBuilderFactory;

    public Job footballJob(@Qualifier("step1") Step step1) {
        return jobBuilderFactory.get("category-job")
                .start(step1)
                .build();
    }

    @Bean
    public Step step1(ItemReader<String> reader, ItemProcessor<String,Category> processor, ItemWriter<Category> writer){

        return null;
    }

    @Bean
    public ItemReader<String> itemReader(){

        return null;
    }

    @Bean
    public ItemProcessor<String, Category> processor(){
        return null;
    }

    @Bean
    public ItemWriter<Category> writer(){
        return null;
    }
}
