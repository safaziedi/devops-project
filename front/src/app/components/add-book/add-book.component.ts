import { Component } from '@angular/core';
import { Book } from 'src/app/models/book.model';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent {

  book: Book = {
    title: '',
    description: '',
  };
  submitted = false;

  constructor(private bookService: BookService) { }

  saveBook(): void {
    const data = {
      title: this.book.title,
      description: this.book.description
    };

    this.bookService.create(data)
      .subscribe({
        next: (res) => {
          console.log(res);
          this.submitted = true;
        },
        error: (e) => console.error(e)
      });
  }

  newBook(): void {
    this.submitted = false;
    this.book = {
      title: '',
      description: ''
    };
  }

}