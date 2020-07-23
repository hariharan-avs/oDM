import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CourselistComponent } from './courselist/courselist.component';
import { EditcourseComponent } from './editcourse/editcourse.component';
import { ViewcourseComponent } from './viewcourse/viewcourse.component';
import { AddcourseComponent } from './addcourse/addcourse.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    CourselistComponent,
    EditcourseComponent,
    ViewcourseComponent,
    AddcourseComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
