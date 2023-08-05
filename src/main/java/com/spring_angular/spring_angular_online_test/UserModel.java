package com.spring_angular.spring_angular_online_test;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sample_online_test_data")
public class UserModel {

	public String getQid() {
		return qid;
	}

	public void setQid(String qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getQtype() {
		return qtype;
	}

	public void setQtype(String qtype) {
		this.qtype = qtype;
	}

	public String getOptone() {
		return optone;
	}

	public void setOptone(String optone) {
		this.optone = optone;
	}

	public String getOpttwo() {
		return opttwo;
	}

	public void setOpttwo(String opttwo) {
		this.opttwo = opttwo;
	}

	public String getOptthree() {
		return optthree;
	}

	public void setOptthree(String optthree) {
		this.optthree = optthree;
	}

	public String getOptfour() {
		return optfour;
	}

	public void setOptfour(String optfour) {
		this.optfour = optfour;
	}

	public String getCorrect_answer() {
		return correct_answer;
	}

	public void setCorrect_answer(String correct_answer) {
		this.correct_answer = correct_answer;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "qid")
	String qid;

	@Column(name = "question")
	String question;
	
	@Column(name = "qtype")
	String qtype;
	
	@Column(name = "optone")
	String optone;
	
	@Column(name = "opttwo")
	String opttwo;
	
	@Column(name = "optthree")
	String optthree;
	
	@Column(name = "optfour")
	String optfour;
	
	@Column(name = "correct_answer")
	String correct_answer;
}
