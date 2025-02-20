<h1>Configuration Spring (Sans Spring Boot)</h1>
<p>Ce projet utilise Spring Core avec une configuration basée sur Java.</p>
<h3>Configuration</h3>
<ul>
    <li>@Configuration : Indique que cette classe contient des configurations pour Spring.</li>
    <li>@ComponentScan : Demande à Spring de scanner le package "com.amine_ezzahi.spring_ioc" pour détecter les composants (@Component, @Service, @Repository).</li>
    <li>AnnotationConfigApplicationContext charge la configuration SpringIocApplication.</li>
    <li>getBean(IServiceProduit.class) récupère un bean géré par Spring.</li>
</ul>
<h2>Premier commit Version 1 : Injection de dépendances par attribut (@Autowired)</h2>
<p>@Autowired sur l’attribut dao permet à Spring d’injecter automatiquement une instance de DaoProuit.</p>
<h2>deuxieme commit Version 2 : Injection de dépendances par constructeur</h2>
<p>@Autowired sur le constructeur de ProductService permet à Spring d’injecter automatiquement une instance de DaoProduct, garantissant une meilleure testabilité et une dépendance explicite. </p>
<p><i><strong>P.S : @Autowired est ici facultatif dans le constructeur, car Spring injecte automatiquement les dépendances lorsqu'il y a un seul constructeur.</strong></i></p>
<h2>Troisième Commit Version 2 : Configuration de la Factory</h2>
<p>Dans ce commit, nous avons créé la classe AppConfig, annotée avec @Configuration et @ComponentScan, en précisant le package à scanner pour la détection des composants. Nous avons ensuite défini deux méthodes factory, annotées avec @Bean, pour instancier les beans de la couche DaoProduit et ServiceProduit. Enfin, dans la classe SpringIocApplication, nous avons supprimé les annotations @Configuration et @ComponentScan, et avons instancié le contexte Spring avec AnnotationConfigApplicationContext en passant AppConfig comme paramètre. Cela permet à Spring de gérer l’injection des dépendances à travers la factory.</p>
