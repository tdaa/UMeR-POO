
import java.io.Serializable;
/**
 * Write a description of class NoDriversException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NoDriversException extends Exception implements Serializable
{
  public NoDriversException(){
    super();
  }

  public NoDriversException(String message){
    super(message);
  }
}
