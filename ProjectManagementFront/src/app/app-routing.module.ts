import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeGuard } from './guards/home.guard';
import { LayoutDesignComponent } from './layout/layout-design/layout-design.component';
import { LayoutComponent } from './layout/layout.component';

const routes: Routes = [
  { path: '', component:  LayoutDesignComponent, canActivate:[HomeGuard]  ,loadChildren: () => import('./home/home.module').then(m => m.HomeModule) },
   {path: 'user', component: LayoutComponent , loadChildren: () => import('./user/user.module').then(m => m.UserModule)}

  //{ path: 'user', component: LayoutBlankComponent, loadChildren: './user/user.module#UserModule' },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
