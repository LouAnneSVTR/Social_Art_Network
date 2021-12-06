package com.socialartnetwork.config;

import com.socialartnetwork.Friend.Friend;
import com.socialartnetwork.Friend.FriendRepository;
import com.socialartnetwork.User.User;
import com.socialartnetwork.User.UserRepository;
import com.socialartnetwork.like.Like;
import com.socialartnetwork.like.LikeRepository;
import com.socialartnetwork.post.PostImage;
import com.socialartnetwork.post.PostImageRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.gcp.autoconfigure.datastore.DatastoreProvider;
import org.springframework.cloud.gcp.data.datastore.core.DatastoreTransactionManager;
import org.springframework.cloud.gcp.data.datastore.repository.config.EnableDatastoreAuditing;
import org.springframework.cloud.gcp.data.datastore.repository.config.EnableDatastoreRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan(basePackageClasses = { User.class, Friend.class, PostImage.class, Like.class})
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableDatastoreAuditing
@EnableDatastoreRepositories(basePackageClasses = {UserRepository.class, FriendRepository.class, PostImageRepository.class, LikeRepository.class})
public class AutoConfiguration {

    @Bean
    DatastoreTransactionManager datastoreTransactionManager(DatastoreProvider datastore) {
        return new DatastoreTransactionManager(datastore);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}