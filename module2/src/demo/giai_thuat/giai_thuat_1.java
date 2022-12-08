package demo.giai_thuat;

public class giai_thuat_1 {

    public static String tienTo(){
        String[] array1 = {"1234","123","1237"};
        String[] array0;
        int item0 = array1[0].split("").length;
        for (String item :array1) {
            array0 = item.split("");
            if (item0 > array0.length){
                item0 = array0.length;
            }
        }
        boolean a = true;
        String[]aa;
        String count = "";
        for (int i = 0; i < item0; i++) {
            array0 = array1[0].split("");
            for (int j = 1; j < array1.length; j++) {
                aa = array1[j].split("");
                if (array0[i].equals(aa[i])){
                    a=true;
                }else {
                    a= false;
                    break;
                }
            }
            if (a){
                count+=array0[i];
            }else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(tienTo());
    }
}
