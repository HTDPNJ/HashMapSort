import java.util.*;

public class Test
{
    public static void main(String[] args)
    {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(4,34);
        map.put(5,35);
        map.put(1,36);
        sortbykey(map);
        sortbyvalue(map);
    }
    public static List<Map.Entry<Integer,Integer>> sortbykey( Map<Integer,Integer> map){
        List<Map.Entry<Integer,Integer>>list=new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>()
        {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
            {
                int result=o1.getKey()-o2.getKey();
                if(result==0)
                    return 0;
                else if(result<0)
                    return -1;
                else
                    return 1;
            }
        });
        for(Map.Entry<Integer,Integer> mapping:list){
            System.out.println(mapping.getKey()+":"+mapping.getValue());
        } ///打印输出
        return list;
    }
    public static List<Map.Entry<Integer,Integer>> sortbyvalue(Map<Integer,Integer>map){
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>()
        {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
            {
                int result=o1.getValue()-o2.getValue();
                if(result<0)
                    result=-1;
                else if(result>0)
                    result=1;
                else
                     result=0;
                return result;
            }
        });
        for(Map.Entry<Integer,Integer> mapping:list){
            System.out.println(mapping.getKey()+":"+mapping.getValue());
        } ///打印输出
        return list;
    }
}
