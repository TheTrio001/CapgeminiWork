package com.cg.ppmappbasic.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.ppmappbasic.domain.Project;
import com.cg.ppmappbasic.service.ProjectService;
import com.cg.ppmappbasic.serviceimpl.ProjectServiceImpl;

public class MenuUtil {
	
	private ProjectService projectService;
	
	public MenuUtil() {
		projectService=new ProjectServiceImpl();
	}
	
	public void start() {
		Scanner sc=new Scanner(System.in);
		int optionChoice;
		String continueChoice;
		do {
			showMenu();
			System.out.println("Enter Your Choice : ");
			optionChoice = sc.nextInt();
			switch (optionChoice) {
			case 1:
				Project project = getProjectInput(sc);				
				projectService.createProject(project);
				break;
			case 2:
				System.out.println("--------Project List-----------");
				List<Project> projects = projectService.listProjects();
				for (Project prj : projects) {
					System.out.println(prj);
				}
				break;
			case 3:
				List<Project> projects_list = projectService.listProjects();
				Project updated_project = updateProject(sc,projects_list);
				projectService.updateProject(updated_project);
				
				break;
			case 4:
				System.out.println("Deleting   Project please enter the project Id ");
				int id = getProjectId(sc);
				projectService.removeProject(id);
				break;

			default:
				System.out.println("Wrong Choice");
				break;
			}
			System.out.println("Do you want to continue : (yes/no) : ");
			continueChoice = sc.next();
		}while(continueChoice.equals("yes"));
	}

	private Project updateProject(Scanner sc, List<Project> projects_list) {
		List<Project> project = new ArrayList<Project>();
		System.out.println("please enter the Project Id you would like to edit from the given projects\n");
		for (Project prj : projects_list) {
			System.out.println(prj);
		}
		int enter_id = sc.nextInt();
		for (Project prj : projects_list) {
			if(prj.getId()==enter_id) {
				System.out.println("press 1 to update name");
				System.out.println("press 2 to update description");
				System.out.println("press 3 to update project id");
				int case_number = sc.nextInt();
				if(case_number == 1) {
					System.out.println("enter name");
					String update_name = sc.next();
					prj.setName(update_name);
				}
				else if(case_number == 2) {
					System.out.println("enter designation");
					String update_designation = sc.next();
					prj.setDescription(update_designation);
				}
				else {
					System.out.println("enter projectId");
					String update_pid = sc.next();
					prj.setPid(update_pid);
				}
				project.add(prj);
			}	
				
		}
			
		return project.get(0);
	}

	private int getProjectId(Scanner sc) {
		int projectId = sc.nextInt();
		return projectId;
	}

	private Project getProjectInput(Scanner sc) {
		Project project = new Project();
		System.out.println("Enter Project Name");
		project.setName(sc.next());
		System.out.println("Enter Project descrition");
		project.setDescription(sc.next());
		System.out.println("Enter Project ID");
		project.setPid(sc.next());
		return project;
	}

	private void showMenu() {
		System.out.println("-------PPM Menu--------");
		System.out.println("1. Create Project");
		System.out.println("2. List Projects");
		System.out.println("3. Update Projects");
		System.out.println("4. Delete Projects");
	}

}
