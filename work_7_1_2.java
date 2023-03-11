public class work_7_1_2 {
    public static void main(String[] args){
        //第1题
        A01 a01 = new A01();
        double[] arr = {12.1, 12.3};
        if(a01.max(arr) != null){
            System.out.println(a01.max(arr));
        }else{
            System.out.println("你的输入有误，数组不能为null或者{}");
        }
        //第2题
        A02 a02 = new A02();
        String[] s02 = {"xiaoming", "xiaohon", "xiaohua"};
        String target = "xiaohon";
        Integer index = a02.find(target, s02);
        if(index != null){
            System.out.println("index =" + index);
        }else{
            System.out.println("你的输入有误" + index);
        }
    }
}
//寻找最大值
class A01{
    public Double max(double[] arr){
        if(arr != null && arr.length > 0){
            double max = arr[0];
            for(int i = 1; i < arr.length; i++){
                if(max < arr[i]){
                    max = arr[i];
                }
            }
            return max;
        }else{
            return null;
        }
    }
}
//寻找字符串
class A02{
    private int index = -1;
    public Integer find(String target, String[] s2){
        if(s2.length != 0 && s2 != null){
            for(int i = 0; i < s2.length; i++){
                if(target.equals(s2[i])){//注意字符比较一定要用equals;这里犯错了
                    index = i;
                }
            }
            return index;
        }else{
            return null;
        }
    }
}

