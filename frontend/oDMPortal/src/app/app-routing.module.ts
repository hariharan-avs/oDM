import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CourselistComponent } from './courselist/courselist.component';

const routes: Routes = [
  {path:'',component:CourselistComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
