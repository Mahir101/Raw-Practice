// could have used regex instead to simplify life but this is okay this is a good practice too 
// believe me it is hard to write code without IDE and the chance of writing wrong code increases
// so practice on google code or some text editor

public detectPhoneNumber(String s) {
  int sz = s.length();
  char ch1 = '+';
  string ch2 = "88"
   
    // +8801712232327 // 14
    // +8801712-232327 // 15 *
    // 8801712232327 //13
    // 8801712-232327 //14 *
    // 01712232327 //11
    // 01712-232327 //12 *
   
  
  int idx8801 = s.indexOf("8801"), idx01 =  s.indexOf("01"),  idxp8801 =  s.indexOf("+8801");
  bool b8801 = s.contains("8801"), b01 = s.contains("01"), bp8801 = s.contains("+8801");
  
  if(b8801 && idx8801==0 && inBetween3to7(s.charAt(4)) ) {
    if(s.charAt(5)=='-') {
        if(i==5) {
          return areRestNumbers(s.substring(6, s.length())) && sz==14;
        } else {
          
          return false;
        }
      
    } 
    
    return areRestNumbers(s.substring(5, s.length())) && sz==13;
    
   
  }
  
  else if(b01 && idx01==0 && inBetween3to7(s.charAt(2)) {
    
     if(s.charAt(3)=='-')) {
     if(i==3) {
              return areRestNumbers(s.substring(4, s.length())) && sz==12;

        } else {
        
          return false;
        }
      
    }
        return areRestNumbers(s.substring(3, s.length())) && sz==11;

  
  }
  
  else if(bp8801 && idxp8801==0 && inBetween3to7(s.charAt(5)) {
    if(s.charAt(6)=='-')) {
       if(i==6) {
              return areRestNumbers(s.substring(7, s.length())) && sz==15;

        } else {
        
          return false;
        }
      
    
    }
    
        return areRestNumbers(s.substring(6, s.length())) && sz==14;

    
  } 
  
  
  return false;
  

  
}

boolean inBetween3to7(char ch) {
  return ch<='7' && ch>='3';
}

boolean areRestNumbers(string s) [
  int sz = s.length();
  for(int i=0; i<sz; i++) {
    if(! (s.charAt(i)>='0' && s.chartAt(i)<='9')) 
      return false;
  }
  return true;
}
