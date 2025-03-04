dependencies {
    // Spring Boot Starters
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa:3.2.5'
    implementation 'org.springframework.boot:spring-boot-starter-web:3.2.5'

    // Kafka
    implementation 'org.springframework.kafka:spring-kafka:3.1.4'

    // H2 Database
    runtimeOnly 'com.h2database:h2:2.2.224'

    // Testing
    testImplementation 'org.springframework.boot:spring-boot-starter-test:3.2.5'
    testImplementation 'org.springframework.kafka:spring-kafka-test:3.1.4'
    testImplementation 'org.testcontainers:kafka:1.19.1'
}
