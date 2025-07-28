public class front3{
public String front3(String str) {
  String n="";
  if (str.length() <= 3){ n= str;}
  else { n= str.substring(0,3);}
  return n+n+n;
}}