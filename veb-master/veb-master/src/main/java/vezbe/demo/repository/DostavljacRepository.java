package vezbe.demo.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;
import vezbe.demo.model.*;
@Repository
public interface DostavljacRepository  extends JpaRepository<Dostavljac, Long> {
}
