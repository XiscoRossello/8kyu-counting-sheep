// Creamos un codigo que recorre una array boolena y teniendo en cuenta los posibles nulls, cuenta las ovejas true y nos da el numero//
public class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
      int x = 0;
      for (int i = 0; i < arrayOfSheeps.length; i++){
        if (arrayOfSheeps[i] != null){
          if (arrayOfSheeps[i] == true){
                    x++;
          }
        }
      }  
      return x;
    }
}
