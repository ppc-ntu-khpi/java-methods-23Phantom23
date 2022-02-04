//package domain;

/**
 * 
 * @author Марченко Даніїл
 */
public class Exercise {
    /**
     * Метод який вираховує ваше число судьби (Додає всі цифри дати народження доки не залишиться одна цифра)
     * @param strDate Строка с датой
     * @return Число судьби (додані цифри дати народження)
     */
    public static int Calculate(String strDate){
        strDate = strDate.replaceAll("[,.]", "");
        int intDate = Integer.parseInt(strDate.trim());
        int numFate = 0;
        for (;intDate>0;intDate /=10){
          numFate += intDate%10;
        }
        if(numFate/10 != 0){
          numFate = numFate/10 + numFate%10;
        }
        return numFate;
    }
}