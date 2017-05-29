The RandomWordGenerator bean is used by the MessageGenerator bean, which means that RandomWorkGenerator would usually 
be create first.

But the @Bean method ApplicationConfiguration.randomWordGenerator() is annotated so the bean is not initialized before 
the first time someone actually calls a method on the bean.  
