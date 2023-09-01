package day7.day7.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import day7.day7.Entity.Car;
import jakarta.transaction.Transactional;

public interface CarRepo extends JpaRepository<Car,Integer>{
	@Query("select f from Aeroplane f")
	   public List<Car> getAllBabyUsingJPQL();
	    @Modifying
	    @Transactional
	    @Query(value="update aeroplane set car_name=?1 where id=?2",nativeQuery = true)
	    public int updateinfo(String newtype,int oldid);
		public List<Car> getAllCarUsingJPQL();

}
