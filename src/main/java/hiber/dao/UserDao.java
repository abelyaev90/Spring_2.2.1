package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;
//import org.hibernate.mapping.List;


public interface UserDao {
   void add(User user);
   List<User> listUsers();

   public User getUserByCarModelAndCarSeries(String model, int series);
}
