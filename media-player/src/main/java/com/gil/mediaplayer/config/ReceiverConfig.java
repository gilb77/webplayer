package com.gil.mediaplayer.config;
//
//import com.gil.mediaplayer.model.MovieInfo;
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.apache.kafka.common.serialization.StringDeserializer;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.EnableKafka;
//import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
//import org.springframework.kafka.core.ConsumerFactory;
//import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
//import org.springframework.kafka.support.serializer.JsonDeserializer;

//@Configuration
//@EnableKafka
//public class ReceiverConfig {
//
//    @Value("${kafka.bootstrap-servers}")//Check its exists !!!!!
//    private String bootstrapServers;
//
//
//    @Bean
//    public Map<String, Object> consumerConfigs() {
//        Map<String, Object> props = new HashMap<>();
//        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
//        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
//        props.put(ConsumerConfig.GROUP_ID_CONFIG, "json");
//
//        return props;
//    }
//
//    @Bean
//    public ConsumerFactory<String, MovieInfo> consumerFactory() {
//        return new DefaultKafkaConsumerFactory<>(consumerConfigs(), new StringDeserializer(),
//                new JsonDeserializer<>(MovieInfo.class));
//    }
//
//    @Bean
//    public ConcurrentKafkaListenerContainerFactory<String, MovieInfo> kafkaListenerContainerFactory() {
//        ConcurrentKafkaListenerContainerFactory<String, MovieInfo> factory =
//                new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(consumerFactory());
//
//        return factory;
//    }
//
//
//}
