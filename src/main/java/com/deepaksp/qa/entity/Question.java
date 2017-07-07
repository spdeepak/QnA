package com.deepaksp.qa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Deepak
 *
 */
@Entity
public class Question {

    @Id
    @GeneratedValue
    private long id;

    private long version;

    private String question;

}
