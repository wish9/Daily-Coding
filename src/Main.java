import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //DailyCoding 코플릿 1번
//        String[] arr = new String[]{"Queen", "Elizabeth", "Of Hearts", "Beyonce"};
//        TransformFirstAndLast transform = new TransformFirstAndLast();
//
//
//        HashMap<String, String> output = transform.transformFirstAndLast(arr);
//        System.out.println(output);

        //DailyCoding 코플릿 2번
        CalculateWhenThePrincipalDoubles calculateWhenThePrincipalDoubles = new CalculateWhenThePrincipalDoubles();

        System.out.println(calculateWhenThePrincipalDoubles.computeWhenDouble(7));
        System.out.println(calculateWhenThePrincipalDoubles.computeWhenDouble(3.2));


        //stringfy 메서드 (자바타입 -> JSON타입) 수동으로 만들기
//        Json json = new Json();
//
//        System.out.println(json.stringify(77));
//        System.out.println(json.stringify("stringfy"));
//        System.out.println(json.stringify(true));
//        System.out.println(json.stringify(new String[]{"a", "b", "c", "d", "e"}));
//        System.out.println(json.stringify(new Object[]{7, new Object[]{new Object[]{}, 1, 2}}));
//        System.out.println(json.stringify(new Object[]{new Object[]{new Object[]{}}}));
//
//        HashMap<Object, Object> hashMap = new HashMap<>(){{
//            put("a","apple");
//            put("7",77);
//            put("true", true);
//            put("false", false);
//            put("null", null);
//        }};
//
//        System.out.println(json.stringify(hashMap));


    }
}