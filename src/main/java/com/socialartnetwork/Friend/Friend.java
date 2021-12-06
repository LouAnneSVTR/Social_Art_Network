package com.socialartnetwork.Friend;

import java.util.Date;
import java.util.List;

import com.socialartnetwork.User.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;

import javax.persistence.Column;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name= "friends")
public class Friend {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "date")
    private Date createdDate;

    @Column(name = "id_first_user")
    private Long idFirstUser;

    @Column(name = "id_second_user")
    private Long idSecondUser;


}