package guru.cooperhanke.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JournalRepo extends MongoRepository<Journal, String> {
    public List<Journal> findByTitleLike(String word);
}
