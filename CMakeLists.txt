cmake_minimum_required(VERSION 3.10.2)

get_filename_component(project_name ${CMAKE_CURRENT_SOURCE_DIR} NAME)

project(${project_name})

find_package(Threads REQUIRED)

add_executable(
        ${project_name}
        src/main.cpp
)

target_link_libraries(
        ${PROJECT_NAME}
        Threads::Threads
)