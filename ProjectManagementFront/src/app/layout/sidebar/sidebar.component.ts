import { DOCUMENT } from '@angular/common';
import { Component, Inject, OnInit } from '@angular/core';

declare const $: any;
declare interface RouteInfo {
    path: string;
    title: string;
    icon: string;
    class: string;
}
export const ROUTES: RouteInfo[] = [
    { path: '/dashboard', title: 'Dashboard',  icon: 'dashboard', class: '' },
    { path: '/user-profile', title: 'User Profile',  icon:'person', class: '' },
    { path: '/table-list', title: 'Table List',  icon:'content_paste', class: '' },
    { path: '/typography', title: 'Typography',  icon:'library_books', class: '' },
    { path: '/icons', title: 'Icons',  icon:'bubble_chart', class: '' },
    { path: '/maps', title: 'Maps',  icon:'location_on', class: '' },
    { path: '/notifications', title: 'Notifications',  icon:'notifications', class: '' },
    { path: '/upgrade', title: 'Upgrade to PRO',  icon:'unarchive', class: 'active-pro' },
];

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit {

  isActive:boolean = false;
  sdiebarShow:boolean = false;
  dropDownMenuShow:boolean = false;
  personProfile = {};
  menuId:any = 0;
  // private _LayoutService;
  // private _ProfileService;
  clickedIndex: number = 0;
  menuIndex:number=0;
  SideBarMenusList = [{id:1,name:'Project',isAssigned:false,subMenu:[{id:1,name:'Project List',isAssigned:true},{id:2,name:'Add Project',isAssigned:true},{id:2,name:'Edit Project',isAssigned:true}]},{id:2,name:'User List',isAssigned:false,subMenu:[]}];
  // SideBarMenusList: Array<AssignRolesViewModel> = [];
  errorMessage: any;
  constructor(@Inject(DOCUMENT) private _document: Document,
   ) {
  }

  sideberCollapse(){
    this.sdiebarShow = !this.sdiebarShow;
    if(this.sdiebarShow){
      this._document.body.classList.add('sidebar-collapse');
      this._document.body.classList.add('sidebar-open');
    }
    else{
      this._document.body.classList.remove('sidebar-collapse');
      this._document.body.classList.remove('sidebar-open');
    }

  }
  ngOnInit() {

  }
  onClickSubMenu(sunMenuIndex:number,i:number){
    this.menuIndex=i;
   this.clickedIndex == sunMenuIndex && this.menuIndex == i? this.clickedIndex = 0 : this.clickedIndex = sunMenuIndex
 }
  menuCollapse(index: number,className:string){
    this.clickedIndex=0;
    this.menuIndex == index ? this.menuIndex = 0 : this.menuIndex = index;
        // this.clickedIndex=0;
      // this.SideBarMenusList.filter(
      //   (menu, i) => i !== index && menu.active
      // ).forEach(menu => menu.active = !menu.active);
    this.SideBarMenusList[index].isAssigned = !this.SideBarMenusList[index].isAssigned;
  }

}
