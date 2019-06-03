package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo1 {

    @Test
    public void test1 () {
        Consumer<String> c = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        c.accept("hhh");
        Consumer<String> c2 = (s) -> System.out.println(s);
        c2.accept("ttt");
    }

    @Test
    public void test2 () {
        Supplier<String> s = () -> "ss";
        System.out.println(s.get());
    }

    @Test
    public void test3 () {
        Function<String, String> f = (s) -> s + "b";
        System.out.println(f.apply("a"));
    }

    @Test
    public void test4 () {
        Predicate<Integer> p = (i) -> i>3;
        System.out.println(p.test(2));
    }

    @Test
    public void test5 () {
        xiaofei(500d, money -> System.out.println("消费了"+money));
    }
    @Test
    public void test6 () {
        xiaofei(300d, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("消费了"+aDouble);
            }
        });
    }

    private void xiaofei(Double money, Consumer<Double> consumer) {
        consumer.accept(money);
    }

    @Test
    public void test7 () {
        String[] strs = {"aaa", "bbbfddsaf", "dfsf"};
        List<String> list = Arrays.asList(strs);
        List<String> list1 = this.filterString(list, str -> str.length() > 3);
        list.forEach(str -> System.out.println(str));
        System.out.println("----------------------");
        list1.forEach(str -> System.out.println(str));
    }

    private List<String> filterString(List<String> strs, Predicate<String> p) {
        ArrayList<String> result = new ArrayList<>();
        for (String str : strs) {
            if (p.test(str)) {
                result.add(str);
            }
        }
        return result;
    }


    @Test
    public void test9 () {
        System.out.println("hfsfsafa");
    }
}
