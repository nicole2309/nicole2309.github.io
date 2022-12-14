public class SwitchNumber {
    
// Java Program to check the size
// using the switch...case statement


    public static void main(String[] args) {
  
      int number = 29;
      String size;
  
      // switch statement to check size
      switch (number) {
  
        case 29:
          size = "Small";
          break;
  
        case 42:
          size = "Medium";
          break;
  
        // match the value of week
        case 44:
          size = "Large";
          break;
  
        case 48:
          size = "Extra Large";
          break;
        
        default:
          size = "Unknown";
          break;
  
      }
      System.out.println("Size: " + size);
    }
  }
