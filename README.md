<details>
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#about-the-project">About The Project</a></li>
    <li><a href="#introduction">Introduction</a></li>
  </ol>
</details>

&nbsp;

## About The Project

- GitLab CI: Pipelines, CI/CD and DevOps for Beginners
- Learn GitLab CI / CD with Docker & DevOps: obtain valuable DevOps skills. Build pipelines.

&nbsp;

---

&nbsp;

## Introduction

- GitHub has a similar concept called **GitHub Actions**. You can create pipelines in any CI/CD systems.
- **Why GitLab CI?**
  - Scalable architecture
  - Docker first approach
  - Pipeline as a code
  - Merge requests with CI support
  - Partially open source
- **About the course**
  - Introduction -> Basic CI/CD Workflow -> GitLab CI Fundamentals -> Advanced CI/CD workflows -> Advanced usage & specific topics

### Setup

- GitLab Project -> Settings -> CI/CD -> Runners
  - [Specific runners](https://docs.gitlab.com/runner/install/)
  - Shared runners (May require credit card)
- SSH Setup
- Docker Setup (Ruby Image)

### 01-car-assembly-line

- **stages**
- Job1 (Upload) & Job2 (Download) via **artifact repository**
- **GitLab Architecture**
  - Server -> Runner(s)r -> Artifacts

&nbsp;

---

&nbsp;

> **Quan:** Pipelines in real projects

> **Valentin:** > **One pipeline per project (real project, not Gitlab project) or multiple pipeline per project?**
>
> Many of the software build today is a small component (sometimes also called microservice). For such small projects, typically there is one Gitlab project and one pipeline.
>
> Gitlab can anyway only have one pipeline per Gitlab project. Larger projects may need a pipeline to span multiple projects. There is no hard rule, it depends from case to case.
>
> **One developer has his own pipeline or share a pipeline with other developers?**
>
> Typically the master pipeline is shared by everybody. If a merge request Git workflow is used, each developer will create a new branch and have his/her own pipeline. So one pipeline per branch.
>
> **When you debug by run/fail a lot of time, does this affect other developers?**
>
> If you use branches, this will not affect others. If the pipeline for the master branch fails, this will affect everyone. I hope this clarifies a few things.

&nbsp;

---

&nbsp;
