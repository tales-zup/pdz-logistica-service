package com.example.logisticaservice;

//@Configuration
public class AwsSQSConfig {

//    @Value("${cloud.aws.credentials.access-key}")
//    private String awsAccessKey;
//
//    @Value("${cloud.aws.credentials.secret-key}")
//    private String awsSecretKey;
//
//    @Bean
//    public ObjectMapper objectMapper() {
//        return new ObjectMapper();
//    }

//    @Bean
//    public QueueMessagingTemplate queueMessagingTemplate(){
//        return new QueueMessagingTemplate(amazonSQSAsync());
//    }

//    public AmazonSQSAsync amazonSQSAsync() {
//        return AmazonSQSAsyncClientBuilder.standard()
//                .withRegion(Regions.SA_EAST_1)
//                .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(awsAccessKey,awsSecretKey)))
//                .build();
//    }

//    @Bean
//    public QueueMessageHandlerFactory queueMessageHandlerFactory(
//            final ObjectMapper mapper, final AmazonSQSAsync amazonSQSAsync){
//
//        final QueueMessageHandlerFactory queueHandlerFactory =
//                new QueueMessageHandlerFactory();
//        queueHandlerFactory.setAmazonSqs(amazonSQSAsync);
//        queueHandlerFactory.setArgumentResolvers(Collections.singletonList(
//                new PayloadMethodArgumentResolver(jackson2MessageConverter(mapper))
//        ));
//        return queueHandlerFactory;
//    }

//    @Bean
//    public QueueMessageHandlerFactory queueMessageHandlerFactory(
//            AmazonSQSAsync amazonSQS, BeanFactory beanFactory) {
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        // This is the java time module needed in the mapper (can be read in the question)
//        objectMapper.registerModule(new JavaTimeModule());
//
//        // Wrapped in this
//        MappingJackson2MessageConverter jacksonMessageConverter =
//                new MappingJackson2MessageConverter();
//        jacksonMessageConverter.setSerializedPayloadClass(String.class);
//        jacksonMessageConverter.setObjectMapper(objectMapper);
//        jacksonMessageConverter.setStrictContentTypeMatch(true);
//
//        // Wrapped in this
//        List<MessageConverter> payloadArgumentConverters = new ArrayList<>();
//        payloadArgumentConverters.add(jacksonMessageConverter);
//
//        // This is the converter that is invoked on SNS messages on SQS listener
//        NotificationRequestConverter notificationRequestConverter =
//                new NotificationRequestConverter(jacksonMessageConverter);
//
//        payloadArgumentConverters.add(notificationRequestConverter);
//        payloadArgumentConverters.add(new SimpleMessageConverter());
//
//        // It needs to be wrapped in this
//        CompositeMessageConverter compositeMessageConverter =
//                new CompositeMessageConverter(payloadArgumentConverters);
//
//        Assert.notNull(amazonSQS);
//        Assert.notNull(beanFactory);
//        QueueMessageHandlerFactory factory = new QueueMessageHandlerFactory();
//        factory.setAmazonSqs(amazonSQS);
//        factory.setBeanFactory(beanFactory);
//
//        // The factory has this method for custom resolvers (can be read in the question)
//        factory.setArgumentResolvers(Arrays.asList(
//                new NotificationMessageArgumentResolver(compositeMessageConverter)));
//
//
//        return factory;
//    }

//    private MessageConverter jackson2MessageConverter(final ObjectMapper mapper){
//
//        final MappingJackson2MessageConverter
//                converter = new MappingJackson2MessageConverter();
//        converter.setObjectMapper(mapper);
//        return converter;
//    }

}
