class author{
String book;
String book_title;
int book_page;
static int prize = 250;

	public static void main(String[] args) 
	{
		author ekant = new author();
		author abhi = new author();
		ekant.book = "Manifestation";
		abhi.book = "Manipulation";
		ekant.book_title = "Dreams";
		abhi.book_title = "Conquer someones mind";
		ekant.book_page = 500;
		abhi.book_page = 450;

		System.out.println("The first book is "+ekant.book+ " and the title is "+ ekant.book_title+" it consist of "+ekant.book_page+" pages and the cost of the book is " +prize );
		System.out.println("The second book  is "+abhi.book+ " and the title  is "+ abhi.book_title+" it consist of "+abhi.book_page+" pages and the cost of the book is " +prize );

		}
}
