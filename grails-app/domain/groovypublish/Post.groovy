package groovypublish

class Post {

    static hasMany = [comments:Comment]

	String title;
	String teaser;
	String content
	Date lastModified
	Boolean published = false
	SortedSet comments
		
    static constraints = {
    }

    
}
