package com.deepaksp.qa.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

/**
 * @author Deepak
 *
 */
@Entity
public class User {

	@Id
	@GeneratedValue
	private long id;

	private long version;

	@NotNull
	private String firstName;

	private String middleName;

	@NotNull
	private String lastName;

	@Column(length = 140)
	private String description;

	@Email
	@Column(unique = true)
	@NotNull
	private String email;

	@Column(unique = true)
	private String userName;

	@Temporal(TemporalType.DATE)
	@NotNull
	private Date dateOfBirth;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Question> askedQuestions = new HashSet<>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Question> followingQuestions = new HashSet<>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Answer> answers = new HashSet<>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<QuestionComment> questionComments = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<AnswerComment> answerComments = new ArrayList<>();

	public String getFullName() {
		return this.firstName.concat(" ").concat(this.middleName).concat(" ").concat(this.lastName);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = "@".concat(userName);
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Set<Question> getAskedQuestions() {
		return askedQuestions;
	}

	public void setAskedQuestions(Set<Question> askedQuestions) {
		this.askedQuestions = askedQuestions;
	}

	public Set<Question> getFollowingQuestions() {
		return followingQuestions;
	}

	public void setFollowingQuestions(Set<Question> followingQuestions) {
		this.followingQuestions = followingQuestions;
	}

	public Set<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}

	public List<QuestionComment> getQuestionComments() {
		return questionComments;
	}

	public void setQuestionComments(List<QuestionComment> questionComments) {
		this.questionComments = questionComments;
	}

	public List<AnswerComment> getAnswerComments() {
		return answerComments;
	}

	public void setAnswerComments(List<AnswerComment> answerComments) {
		this.answerComments = answerComments;
	}

}
