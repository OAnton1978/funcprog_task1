package q.q;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        String text = "Barracks Extoll Childbirth Reform Retina Sensual Settler Sound imitation Syringe To mint";
        List<String> list = new ArrayList<String>(Arrays.asList(text.split(" ")));
        Collator collator = Collator.getInstance(Locale.UK);
        list.stream()
                .map(new Function<String, String>() {                      //Здесь можно через лямбда выражения, оставил для демонстрации применения "Function", функций высших порядков
                    public String apply(String s) {
                        return s + "-";
                    }
                })
                .sorted(collator)
                .forEach(System.out::println);                              // Side - эффект, скрытый монадной записью (т.к. стрим API результат не записывается, а сразу выводится)
    }
}
