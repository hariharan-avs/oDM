import { Component, OnInit } from '@angular/core';
import { NgserviceService } from '../../ngservice.service';

@Component({
  selector: 'app-courselist',
  templateUrl: './courselist.component.html',
  styleUrls: ['./courselist.component.css']
})
export class CourselistComponent implements OnInit {

  constructor(private _service: NgserviceService) { }

  ngOnInit() {
    this._service.getCoursesListFromBackend().subscribe(
      data => console.log("response received"),
      error => console.log("exception occured")
    )

  }

}
