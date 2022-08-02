//package com.cg.book.app.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//	@Entity
//	@Table(name="relation")
//	
//	public class RelationEntity {
//		@Id
//		@GeneratedValue(strategy = GenerationType.IDENTITY)
//		@Column(name = "relation_id")
//		private int relationId;
//		
//		@ManyToMany
//		@JoinColumn(name = "book_id")
//		@JsonIgnoreProperties("relation")
//		private Book book;
//		
//		@ManyToMany
//		@JoinColumn(name = "category_id")
//		@JsonIgnoreProperties("relation")
//		private Category category;
//
//		public RelationEntity(int relationId, Book book, Category category) {
//			super();
//			this.relationId = relationId;
//			this.book = book;
//			this.category = category;
//		}
//
//		public int getRelationId() {
//			return relationId;
//		}
//
//		public Book getBook() {
//			return book;
//		}
//
//		public Category getCategory() {
//			return category;
//		}
//
//		@Override
//		public String toString() {
//			return "RelationEntity [relationId=" + relationId + ", book=" + book + ", category=" + category + "]";
//		}
//		
//		
//		
//	}