
import java.io.Serializable;
/**
 * Write a description of class UserDoesNotExistsException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserDoesNotExistsException extends Exception implements Serializable
{
  public UserDoesNotExistsException(){
    super();
  }

  public UserDoesNotExistsException(String message){
    super(message);
  }
}
