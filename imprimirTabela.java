package Natsu.Ebac;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class imprimirTabela {
    public  static void main(String[] args){
        TabelaComAnnotation tabComAn = new TabelaComAnnotation();
         Class<? extends TabelaComAnnotation> tabela1 = tabComAn.getClass();
        System.out.println(tabela1);

        System.out.println("");
        Field[] fields = tabela1.getDeclaredFields();
        for (Field field : fields){
            Annotation[] fieldAnnotation = field.getAnnotations();
            for (Annotation annotation : fieldAnnotation){
                if (annotation instanceof TabelaAnnotation){
                    TabelaAnnotation tabelaAnnotation = (TabelaAnnotation) annotation;
                    System.out.println("Complete Information" + tabelaAnnotation);
                    System.out.println("Value" + tabelaAnnotation.value());
                    for (String sala : tabelaAnnotation.sala()){
                        System.out.println("Sala" + sala);
                    }
                    System.out.println("Número da salaNúmero da sala" + tabelaAnnotation.numeroDaSala());
                    System.out.println("");
                }
            }
        }
    }

}
