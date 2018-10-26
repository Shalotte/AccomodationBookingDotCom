package accomodation.booking.com;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import accomodation.booking.com.entities.Book;
import accomodation.booking.com.entities.BookCategory;
import accomodation.booking.com.repositories.BookCategoryRepository;


@SpringBootApplication
public class AccomodationBookingDotComApplication implements CommandLineRunner{
	
private static final Logger logger = LoggerFactory.getLogger(AccomodationBookingDotComApplication.class);

@Autowired
private BookCategoryRepository bookCategoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(AccomodationBookingDotComApplication.class, args);
	}
	
    @Override
    @Transactional
    public void run(String... strings) throws Exception {
        // save a couple of categories
        BookCategory categoryA = new BookCategory("Category A");
        Set bookAs = new HashSet<Book>(){{
            add(new Book("Book A1", categoryA));
            add(new Book("Book A2", categoryA));
            add(new Book("Book A3", categoryA));
        }};
        categoryA.setBooks(bookAs);

        BookCategory categoryB = new BookCategory("Category B");
        Set bookBs = new HashSet<Book>(){{
            add(new Book("Book B1", categoryB));
            add(new Book("Book B2", categoryB));
            add(new Book("Book B3", categoryB));
        }};
        categoryB.setBooks(bookBs);

        bookCategoryRepository.saveAll(new HashSet<BookCategory>() {{
            add(categoryA);
            add(categoryB);
        }});

        // fetch all categories
        for (BookCategory bookCategory : bookCategoryRepository.findAll()) {
            logger.info(bookCategory.toString());
        }
    }
	 
}




