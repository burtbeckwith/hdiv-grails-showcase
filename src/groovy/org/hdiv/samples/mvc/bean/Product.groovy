package org.hdiv.samples.mvc.bean

class Product implements Serializable {
	String productId
	String categoryId
	String name
	String description

	String toString() { name }
}
