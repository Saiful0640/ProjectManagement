import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HomeRoutingModule } from './home-routing.module';
import { StartupComponent } from './startup/startup.component';
import { ProejctCreateComponent } from './Project/proejct-create/proejct-create.component';
import { ProjectListComponent } from './Project/project-list/project-list.component';


@NgModule({
  declarations: [
    StartupComponent,
    ProejctCreateComponent,
    ProjectListComponent
  ],
  imports: [
    CommonModule,
    HomeRoutingModule
  ]
})
export class HomeModule { }
