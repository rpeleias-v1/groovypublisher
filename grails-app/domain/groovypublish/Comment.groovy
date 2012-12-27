package groovypublish

class Comment {

	static belongsTo = Post

	Post post
	String comment
	Commentator who = new Commentator()
	Date dateCreated
    
    static constraints = {
    }

    public int compareTo(Object o) {
    	return dateCreated.compareTo(o.dateCreated)
    }
}
