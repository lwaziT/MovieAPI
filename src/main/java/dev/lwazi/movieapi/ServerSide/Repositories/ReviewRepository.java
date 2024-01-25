package dev.lwazi.movieapi.ServerSide.Repositories;

import dev.lwazi.movieapi.ServerSide.Model.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}

