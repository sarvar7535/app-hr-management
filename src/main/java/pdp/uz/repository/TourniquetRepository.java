package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdp.uz.entity.TourniquetCard;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TourniquetRepository extends JpaRepository<TourniquetCard, UUID> {

    Optional<TourniquetCard> findByEmployee_EmailAndStatusTrue(String email);
}
